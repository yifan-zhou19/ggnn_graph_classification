package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int i;
	int j;
	int x;
	int temp;
	int count;
	int max;
	char c;
	for (i = 0;i < 300;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		if (c == '\n')
		{
			count = i;
			break;
		}
	}
	for (x = 1;x <= count;x++)
	{
		for (i = 0;i < count + 1 - x;i++)
		{
			 if (a[i] < a[i + 1])
			 {
			  temp = a[i];
			  a[i] = a[i + 1];
			  a[i + 1] = temp;
			 }
		}
	}
		if (a[count] == a[0])
		{
		System.out.print("No");
		}
		if (a[count] != a[0])
		{
		   max = a[0];
		   for (j = 0;j <= count;j++)
		   {
			   if (a[j] == max)
			   {
				   ;
			   }
			   else
			   {
				   System.out.printf("%d",a[j]);
				   break;
			   }
		   }
		}
	}

}

