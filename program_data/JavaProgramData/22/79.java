package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int[] a = new int[300];
		 int i;
		 int j;
		 int k;
		 int l;
		 int t;
		 int e;
		 String b = new String(new char[300]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[0] = Integer.parseInt(tempVar);
		 }
		 for (i = 1;System.in.read() != '\n';i++)
		 {

			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }

		 }
		 for (j = 0;j < i;j++)
		 {
			 for (e = j + 1;e < i;e++)
			 {
				 if (a[e] == a[j])
				 {
					 a[e] = 0;
				 }
			 }
		 }
		 for (j = 0;j < i;j++)
		 {
			 k = j;
			 for (l = j + 1;l < i;l++)
			 {
				 if (a[l] > a[k])
				 {
					 k = l;
				 }
			 }
			if (j != k)
			{
				t = a[j];
				a[j] = a[k];
				a[k] = t;
			}
		 }
		 if (i == 1)
		 {
			 System.out.print("No");
		 }
		 else if (a[1] == 0)
		 {
			 System.out.print("No");
		 }
		 else
		 {
			 System.out.printf("%d",a[1]);
		 }


	}








}

