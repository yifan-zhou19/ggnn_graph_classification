package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int z;
		if (m == 1)
		{
			z = 0;
		}
		else
		{
			z = (f(m - 1, n) + n) % m;
		}
		return (z);
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_n = new int[10];
int[] m = new int[10];
int[] r = new int[10];
int t;
	public static void Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int n[10],m[10],r[10],t;
		int i = 0;
		int x;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				Main_n[i] = Integer.parseInt(tempVar2);
			}
			i++;
			t++;
		} while (m[i - 1] != 0);
		t--;
		x = f(m[0], Main_n[0]);
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",f(m[i], Main_n[i]) + 1);
		}
	}
}

