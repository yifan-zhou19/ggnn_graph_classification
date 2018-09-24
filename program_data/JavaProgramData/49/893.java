package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int judge = new int(int s,int e,char a[]);
	void print(int s,int e,char a[]);
	int n;
	int m = 1;
	int i;
	int j;
	String a = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();
	//printf("%d \n",n);
	//printf("%s \n",a);
	for (i = 1;i <= n - 1;i++)
	{
		for (j = 0;j <= n - i - 1;j++)
		{
		int q;
		q = judge(j, j + i, a);
		if (q == 1 && m == 1)
		{
				print(j, j + i, a);
				m++;
		}
		else if (q == 1 && m != 1)
		{
				System.out.print("\n");
				print(j, j + i, a);
		}
		}

	}
	return 0;
	}
	public static int judge(int s, int e, String a)
	{
		if (s >= e)
		{
			return 1;
		}
		else if (!a[s].equals(a[e]))
		{
		return 0;
		}
		else if (a[s].equals(a[e]))
		{
			s++;
			e--;
			return judge(s, e, a);
		}
	}
	public static void print(int s, int e, String a)
	{
		int i;
		for (i = s;i <= e;i++)
		{
		System.out.printf("%c",a[i]);
		}
	}




}

