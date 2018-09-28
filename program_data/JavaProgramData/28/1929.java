package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int count = 0;
		char[][] a = new char[301][500];
		int[] b = new int[301];
		for (i = 0;i < 300;i++)
		{
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  a[i] = tempVar.charAt(0);
						  }
						  n = String.valueOf(a[i]).length();
						  b[i] = n;
						  count++;
						  if (n == 0)
						  {
						  break;
						  }
		}
		for (i = 0;i < count - 1;i++)
		{
							if (i == 0)
							{
							System.out.printf("%d",b[i]);
							}
							else
							{
							System.out.printf(",%d",b[i]);
							}
		}
		return 0;
	}
}

