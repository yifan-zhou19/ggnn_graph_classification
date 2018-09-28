package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int i;
	int j;
	int n;
	int m;
	int k;
	String p;
	String q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (a = 0;a < n;a++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
	p = new Scanner(System.in).nextLine();
	q = p;
	k = 1;
	for (i = 0; * (p.Substring(i)) != '\0';i++)
	{
	for (j = 0,m = 0; * (q.Substring(j)) != '\0';j++)
	{
	if (*(q.Substring(j)) == *(p.Substring(i)))
	{
		m++;
	}
	}
	if (m == 1)
	{
		k = 0;
		System.out.printf("%c\n",*(p.Substring(i)));
		break;
	}
	}
	if (k == 1)
	{
		System.out.print("no\n");
	}
	}
	}
}

