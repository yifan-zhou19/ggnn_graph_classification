package <missing>;

public class GlobalMembers
{
	public static void arn(String a, int n)
	{
		int j;
		int k;
		char t;
		for (j = 0;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (a[j].compareTo(a[k]) < 0)
				{
					t = a[j];
					a[j] = a[k];
					a[k] = t;
				}
			}
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int max(int a, int b);
	public static void Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int l1;
		int l2;
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
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("NO\n");
		}
		else
		{
			arn(a, l1);
			arn(b, l1);
			for (i = 0;i < l1;i++)
			{
				if (a[i] != b[i])
				{
					System.out.print("NO\n");
					break;
				}
			}
		}
		if (i == l1)
		{
			System.out.print("YES\n");
		}
	}
}

