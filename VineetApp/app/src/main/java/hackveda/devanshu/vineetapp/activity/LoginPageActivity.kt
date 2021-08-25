/*
*  LoginPageActivity.kt
*  VineetApp
*
*  Created by Devanshu Shukla.
*  Copyright © 2018 Hackveda. All rights reserved.
*/

package hackveda.devanshu.vineetapp.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import hackveda.devanshu.vineetapp.R


class LoginPageActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, LoginPageActivity::class.java)
		}
	}
	
	private lateinit var signinButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.login_page_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Signin component
		signinButton = this.findViewById(R.id.signin_button)
		signinButton.setOnClickListener({ view ->
			this.onSigninPressed()
		})
	}
	
	fun onSigninPressed() {
	
	}
}
