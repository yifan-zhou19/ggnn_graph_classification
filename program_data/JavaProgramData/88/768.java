package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
	int i;
	int j;
	int k;
	c = new Scanner(System.in).nextLine();

	p = c;
	for (; * p != '\0';p++)
	{
		if (((int) * p > 47 && (int) * p < 58) && ((int) * (p + 1)>47 && (int) * (p + 1) < 58))
		{
	System.out.printf("%c",*p);
		}
	else
	{
	if (((int) * p > 47 && (int) * p < 58) && ((int) * (p + 1) < 48 || (int) * (p + 1)>57))
	{
	System.out.printf("%c\n",*p);
	}
	}
	}
	}
}
