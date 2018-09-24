import java.util.*;

//****************************************
//*???????                      **
//*??? 1100012927              **
//*2011.11.29                     **
//****************************************
void f(char *);
int main()
{
	String n = new String(new char[50]);
	String p;
	n = new Scanner(System.in).nextLine();
	p = n;
	f(p);
		return 0;
}
void f(char * p)
{
	if (*p == '\0')
	{
		return;
	}


	if (*p != ' ')
	{
		System.out.print(p);
		f(++p);
	}
	else if (*(p + 1) != ' ')
	{
		System.out.print(p);
		f(++p);
	}
	else
	{
		f(++p);
	}
}
