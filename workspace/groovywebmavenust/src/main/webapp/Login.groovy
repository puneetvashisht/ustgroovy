html.html()
{
	head()
	{
		title 'Login Form'
	}
	body()
	{
		form(method : 'GET' , action : 'LoginAction.groovy')
		{
			tr()
			{
				td("Firstname:")
				input(type : 'text' , name : 'username')
			}

			tr()
			{
				td("Password:")
				input(type : 'password' ,  name : 'password')
			}

			tr()
			{
				input(type : 'submit')
			}
		}
	}
}