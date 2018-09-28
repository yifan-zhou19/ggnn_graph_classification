package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int m;
		int n;
		int k = 0;
		int[] c = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,'0',(Character.SIZE / Byte.SIZE));
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
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (c[j] == 0)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						c[j] = 1;
						k++;
						break;
					}
				}
				else
				{
					continue;
				}
			}
			}
		if (k == n)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		}
		return 0;


	}

}

