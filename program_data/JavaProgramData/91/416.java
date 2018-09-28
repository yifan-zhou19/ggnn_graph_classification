package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int[] a1 = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
	int p1;

	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (i = 0;i < n;i++)
	{
	a1[i] = a.charAt(i);
	}
	p = a1;
	p1 = a1;
	for (i = 0;i <= n - 2;i++)
	{
		b = tangible.StringFunctions.changeCharacter(b, i, (*p) + (*(p + 1)));
	p++;
	}
	b = tangible.StringFunctions.changeCharacter(b, n - 1, (*p) + p1);
	for (i = 0;i <= n - 1;i++)
	{
	System.out.printf("%c",b.charAt(i));
	}
	return 0;

	}

}

