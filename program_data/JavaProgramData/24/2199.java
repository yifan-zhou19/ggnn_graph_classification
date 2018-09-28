package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[200][20];
		char temp;
		int i;
		int n;
		int[] l = new int[200];
		int min;
		int max;
		for (i = 0;i < 200;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				temp = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(a[i]).length();
			if (temp == '\n')
			{
				n = i + 1;
				break;
			}
		}
		min = max = 0;
		for (i = 0;i < n;i++)
		{
			if (l[i] > l[max])
			{
				max = i;
			}
			if (l[i] < l[min])
			{
				min = i;
			}
		}
		System.out.printf("%s\n",a[max]);
		System.out.printf("%s\n",a[min]);
	}

}

