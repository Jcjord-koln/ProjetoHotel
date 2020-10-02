package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project.PersonDAO.PersonDAO;
import com.example.project.model.Person;

import maes.tech.intentanim.CustomIntent;

public class Register extends AppCompatActivity {
    private EditText edtEmail;
    private EditText edtUser;
    private EditText edtPassword;
    private EditText edtConfirmPass;
    private Button btnSignup;
    PersonDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtEmail = findViewById(R.id.edtEmail);
        edtUser = findViewById(R.id.edtUser);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPass = findViewById(R.id.edtConfirmPass);
        btnSignup = findViewById(R.id.btnSignup);





    }

    public void validation(){
        String mEmail = edtEmail.getText().toString();
        String mUser = edtUser.getText().toString().trim();
        String mPassword = edtPassword.getText().toString();
        String mPassCon = edtConfirmPass.getText().toString();

        if(mEmail.matches("")){
            edtEmail.setError("Campo não pode ficar vázio");
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()){
            edtEmail.setError("Insira um e-mail válido");
            return;
        }

        if(mUser.matches("")){
            edtUser.setError("Campo não pode ficar vázio");
            return;
        }

        if(!mUser.matches("^[A-Za-z][A-Za-z0-9]*$")){

            edtUser.setError("Usuário inválido");
            return;
        }

        if (edtUser.getText().toString().length() < 5) {
            edtUser.setError("Usuário requer no minimo 5 caracteres");
            edtUser.requestFocus();
        }

        if (edtUser.getText().toString().length() > 11) {
            edtUser.setError("Usuário pode ter no máximo 12 caracteres");
            edtUser.requestFocus();
        }

        if(!mPassword.matches(mPassCon)){
            edtConfirmPass.setError("Senhas não conferem");
            return;
        }

        if (edtPassword.getText().toString().length() < 5) {
            edtPassword.setError("Senha muito fraca");
            edtPassword.requestFocus();
        }

    }


    public void insert(View view){
        Person person = new Person();

        person.setEmail(edtEmail.getText().toString());
        person.setUser(edtUser.getText().toString());
        person.setPassword(edtPassword.getText().toString());

        dao = new PersonDAO(this);
        long id = dao.insert(person);
        Toast.makeText(getApplicationContext(),"Registrado com sucesso  ID: "+id,Toast.LENGTH_LONG).show();




    }

    public void nextM(View view){
        Intent it =  new Intent(getApplicationContext(),Menu.class);
        startActivity(it);
    }

    public void exit(View view){

        finish();

    }









}