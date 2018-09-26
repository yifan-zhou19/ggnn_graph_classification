package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b = 0;
		int[] arr = new int[100001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 arr[i] = Integer.parseInt(tempVar2);
			 }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		for (int i = 0;i < n;i++)
		{
			 if (arr[i] != a)
			 {
				 b++;
			 }
		}
		for (int i = 0;i < n;i++)
		{
			 if (arr[i] != a)
			 {
				 if (b == 1)
				 {
					 System.out.printf("%d\n",arr[i]);
					 break;
				 }
				 else
				 {
					 System.out.printf("%d ",arr[i]);
				 }
				 b--;
			 }
		}
	}

}

