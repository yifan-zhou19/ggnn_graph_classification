package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int rest;
	int r;
	int s;
	int t;
	String NUM = new String(new char[150]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		NUM = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	int LEN;
	LEN = NUM.length();
	int i;
	int j;
	int k;
	int m = 0;
	int n = 0;
	char a = 'a';
	char A = 'A';
	char Z = 'Z';
	char z = 'z';
	char zero = '0';
	char nine = '9';
	for (i = 0;i < LEN;i++)
	{
	if (NUM.charAt(i) >= a && NUM.charAt(i) <= z)
	{
	NUM = tangible.StringFunctions.changeCharacter(NUM, i, NUM.charAt(i) - a + 10);
	}
	if (NUM.charAt(i) >= A && NUM.charAt(i) <= Z)
	{
	NUM = tangible.StringFunctions.changeCharacter(NUM, i, NUM.charAt(i) - A + 10);
	}
	if (NUM.charAt(i) >= zero && NUM.charAt(i) <= nine)
	{
	NUM = tangible.StringFunctions.changeCharacter(NUM, i, NUM.charAt(i) - zero);
	}
	}
	for (i = 0;i < LEN;i++)
	{
	m = NUM.charAt(i);
	for (j = 1;j <= LEN - i - 1;j++)
	{
	m *= x;
	}
	n += m;
	}
	rest = n;
	for (i = 0;;i++)
	{
	if (rest == 0)
	{
		break;
	}
	rest /= y;
	}
	int[] PUT = new int[1000];
	int kk = i;
	for (;kk >= 1;kk--)
	{
	r = n % y;
	n /= y;
	PUT[kk - 1] = r;
	}
	if (i == 0)
	{
		System.out.print("0");
	}
	else
	{
		for (j = 0;j < i;j++)
		{
	if (PUT[j] >= 10)
	{
	System.out.printf("%c",PUT[j] - 10 + A);
	}
	else
	{
	System.out.printf("%d",PUT[j]);
	}
		}
	}
	System.out.print("\n");
	}

}

