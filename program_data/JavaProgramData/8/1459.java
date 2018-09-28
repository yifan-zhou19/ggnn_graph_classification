package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int l)
	{
		 int i;
		 int j;
		 int temp;
		 for (i = 1;i < l;i++)
		 {
			 for (j = 0;j < l - i;j++)
			 {
				 if (a[j] > a[j + 1])
				 {
					   temp = a[j];
					   a[j] = a[j + 1];
					   a[j + 1] = temp;
				 }
			 }
		 }
	}
	public static void Main()
	{
		 int i;
		 int l1;
		 int l2;
		 int[] a = new int[100];
		 int[] b = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 l1 = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 l2 = Integer.parseInt(tempVar2);
		 }

			 for (i = 0;i < l1;i++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i] = Integer.parseInt(tempVar3);
				 }
			 }
			 bubble(a, l1);

			 for (i = 0;i < l2;i++)
			 {
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 b[i] = Integer.parseInt(tempVar4);
				 }
			 }
			 bubble(b, l2);
			 for (i = 0;i < l1;i++)
			 {
			 System.out.printf("%d ",a[i]);
			 }
			 System.out.printf("%d",b[0]);
			 for (i = 1;i < l2;i++)
			 {
			 System.out.printf(" %d",b[i]);
			 }

	}

}

