package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String[] a;
		String[] b = new String[100];
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			b[i] = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
		}
		a = b;
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			m = String.valueOf(a[i]).length();
			for (j = 0;j < m;j++)
			{
				if (j == 0 && ((a[i] == '_') || (a[i] >= 'A' && a[i] <= 'Z') || (a[i] >= 'a' && a[i] <= 'z')))
				{
					k++;
				}
				if (j > 0 && ((*(a[i] + j) >= '0' && *(a[i] + j) <= '9') || (*(a[i] + j) >= 'A' && *(a[i] + j) <= 'Z') || (*(a[i] + j) >= 'a' && *(a[i] + j) <= 'z') || (*(a[i] + j) == '_')))
				{
					k++;
				}
			}
			if (k == m)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
			k = 0;
		}
	}
}

