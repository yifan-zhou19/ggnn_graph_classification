package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int min(int x,int y)
	{
		if (x < y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int t1;
		int t2;
		int t;
		int k;
		String s = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			s = tangible.StringFunctions.changeCharacter(s, 0, tempVar2);
		}
		t1 = a[0];
		t2 = a[0];
		if (s.charAt(0) == ',')
		{
			i = 1;
			do
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, tempVar4);
				}
				if (a[i] == t1 || a[i] == t2)
				{
					i++;
					continue;
				}
				else
				{
					t = t1;
					k = a[i];
					t1 = max(t, k);
					if (t1 == t2)
					{
						t2 = min(t, k);
					}
					else
					{
						t2 = max(t2, min(t, k));
					}
					i++;
				}
			}while (s.charAt(i - 1) == ',');
			if (t1 == t2)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",t2);
			}
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

