//******************
//*?????3?5?7????**
//*?????1200012922**
//*???2012.9.28**
//******************

int main()    
{
	int a;//??a???
	int x;//??x??? 
	x = 0;//??x?0
	cin >> a;//??a
	if(a % 3 == 0)
    {
		x = 1;
		cout << 3 ;//??a??3?????3?x=1
	};
	if(a % 5 == 0)
	{ 
		{if(x==1)
			cout<<" ";}
		x = 1;
		cout << 5;};	//??a??5?????x?1???5????????5
		if(a % 7 == 0)
		{
			{if(x == 1)
				cout << " ";}
			cout << 7;};	//??a??7?????x?1???7????????7
			if(a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
				cout << 'n' << endl;//a???3,5,7?????n
			
			return 0;
}