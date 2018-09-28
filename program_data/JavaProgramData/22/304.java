package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k = 0;
		int temp;
		String q = new String(new char[300]);
		for (i = 0;;i++)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			k++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				q = tangible.StringFunctions.changeCharacter(q, i, tempVar2);
			}
			if (q.charAt(i) != ',')
			{
				break;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		 if (k == 1 || a[0] == a[k - 1])
		 {
			 System.out.print("No");
		 }
		else
		{
			for (i = 1;i < k;i++)
			{
			if (a[i] != a[i - 1])
			{
				System.out.printf("%d",a[i]);
				break;
			}
			}
		}
	}

}

