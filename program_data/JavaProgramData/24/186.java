package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int num = 0;
		int[] a = new int[50];
		int max;
		int min;
		char[][] str = new char[50][20];
		String strmax = new String(new char[20]);
		String strmin = new String(new char[20]);
		char z;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			a[i] = String.valueOf(str[i]).length();
			num++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				z = tempVar2.charAt(0);
			}
			if (z == '\n')
			{
				break;
			}
		}
		max = a[0];
		min = a[0];
		strmax = str[0];
		strmin = str[0];
		for (i = 1;i < num;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				strmax = str[i];
			}
			if (a[i] < min)
			{
				min = a[i];
				strmin = str[i];
			}
		}
		System.out.printf("%s\n%s",strmax,strmin);
	}
}

