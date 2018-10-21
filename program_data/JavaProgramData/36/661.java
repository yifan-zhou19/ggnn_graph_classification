package <missing>;

public class GlobalMembers
{
	public static void pai(String a)
	{
		int i;
		int b;
		int j;
	for (i = 0;i <= a.length() - 1;i++)
	{
							   for (j = i + 1;j <= a.length() - 1;j++)
							   {
							   if (a[i].compareTo(a[j]) > 0)
							   {
								   b = a[i];
								   a[i] = a[j];
								   a[j] = b;
							   }
							   }
	}
	}
	public static void Main(String[] args)
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	pai(a);
	pai(b);
	if (strcmp(a,b) == 0)
	{
	System.out.print("YES");
	}
	else
	{
	System.out.print("NO");
	}
	}

}

