//*****************
//??????? 
//?????
//???2011-11-16
//*****************
char function = int; //????
int main()
{
	int a;
	int b;
	int k = 0;
	int sum = 0;
	int t;
	int i = 0;
	int count = 0;
	int sum1 = 1;
	String n = new String(new char[100000]);
	String c = new String(new char[100000]);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;n.charAt(i) != '\0';i++) //??n????
	{
		k++;
	}
	for (i = k - 1;i >= 0;i--)
	{
		if (n.charAt(i) - '0' <= 9) //????n???10???
		{
			sum = sum + (n.charAt(i) - '0') * sum1;
		}
		if (n.charAt(i) - '0' > 9 && n.charAt(i) - '0' <= 42)
		{
			sum = sum + (n.charAt(i) - '0' - 7) * sum1;
		}
		if (n.charAt(i) - '0' > 42 && n.charAt(i) - '0' <= 74)
		{
			sum = sum + (n.charAt(i) - '0' - 39) * sum1;
		}
		sum1 = sum1 * a;
	}
	for (i = 0;;i++)
	{

		t = sum % b; //???
		sum = sum / b;
		c = tangible.StringFunctions.changeCharacter(c, i, function(t));
		count++; //?????????
		if (sum == 0)
		{
			break;
		}
	}
	for (i = count - 1;i >= 0;i--)
	{
		System.out.print(c.charAt(i));
	}
	return 0;
}
char function(int t) //??????????????
{
	final String a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	return a.charAt(t);
}

