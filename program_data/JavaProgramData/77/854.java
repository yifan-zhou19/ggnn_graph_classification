import java.util.*;

//****************************
//???????
//?????
//???2011-11-22
//****************************
String a = new String(new char[10000]); //??????
int function = int; //????
int main()
{
	int i;
	int j;
	a = new Scanner(System.in).nextLine(); //?????
	for (i = 0;a.charAt(i) != '\0';i++)
	{
		if (a.charAt(i) != a.charAt(0)) //???????
		{
			j = function(i - 1); //??????????????
			System.out.print(j);
			System.out.print(" ");
			System.out.print(i);
			System.out.print("\n");
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(i)); //???????????
		}
	}
	return 0;
}
int function(int j)
{
	if (a.charAt(j) == a.charAt(0))
	{
		return j;
	}
	else
	{
		return function(j - 1);
	}
}

