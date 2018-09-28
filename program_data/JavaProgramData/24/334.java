package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][20];
		int[] lengh = new int[50];
		char c;
		int n;
		int i;
		int j1;
		int j2;
		int max;
		int min;
		for (i = 0;c != '\n';i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			c = System.in.read();
		}
		n = i;
		for (i = 0,max = 0,min = String.valueOf(a[1]).length();i < n;i++)
		{
			lengh[i] = String.valueOf(a[i]).length();
			if (lengh[i] > max)
			{
				max = lengh[i];
				j1 = i;
			}
			if (lengh[i] < min)
			{
				min = lengh[i];
				j2 = i;
			}
		}
		System.out.printf("%s\n%s",a[j1],a[j2]);
	}
}

