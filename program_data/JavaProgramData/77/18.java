public class child
{
	public char c;
	public int a;
}

package <missing>;

public class GlobalMembers
{
	public static child[] dui = tangible.Arrays.initializeWithDefaultchildInstances(100);
	public static void print(child[] dui, int n)
	{
		int i;
		if (n == 2)
		{
			System.out.printf("%d %d",dui[0].a,dui[1].a);
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				if (dui[i].c != dui[i - 1].c)
				{
					System.out.printf("%d %d\n",dui[i - 1].a,dui[i].a);
					for (i = i + 1;i < n;i++)
					{
						dui[i - 2] = dui[i];
					}
					print(dui, n - 2);
					break;
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int n;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		for (i = 0;i < n;i++)
		{
			dui[i].c = s.charAt(i);
			dui[i].a = i;
		}
		print(dui, n);
	}
}

