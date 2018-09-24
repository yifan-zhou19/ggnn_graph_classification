package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void change(char a[],int n);
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = a.length();
		change(a, n);
		change(b, n);
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
	public static void change(String a, int n)
	{
		int i;
		int j;
		char t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i].compareTo(a[j]) > 0)
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}



}

