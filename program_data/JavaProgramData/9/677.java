public class person
{
	public String ID = new String(new char[10]);
	public int age;

}

package <missing>;

public class GlobalMembers
{
	public static person[] per = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static int Main()
	{
	   int i;
	   int n;
	   int j;
	   int k = 0;
	   int[] a = new int[100];
	   int num = 0;
	   int temp1;
	   char[][] b =
	   {
		   {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	   };
	   char[] temp2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   per[i].ID = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   per[i].age = Integer.parseInt(tempVar3);
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (per[i].age >= 60)
		   {
			a[k] = per[i].age;
			b[k] = per[i].ID;
			k++;
			num++;
		   }
	   }
		for (j = 0;j < num;j++)
		{
			for (k = 0;k < num - j;k++)
			{
			if (a[k] < a[k + 1])
			{
				temp1 = a[k];
				a[k] = a[k + 1];
				a[k + 1] = temp1;
				temp2 = b[k];
				b[k] = b[k + 1];
				b[k + 1] = temp2;
			}
			}
		}
		for (i = 0,k = num;i < n;i++)
		{
			if (per[i].age < 60)
			{
				a[k] = per[i].age;
			 b[k] = per[i].ID;
			 k++;
			 num++;
			}
		}
		for (k = 0;k < num - 1;k++)
		{
		System.out.printf("%s\n",b[k]);
		}
		System.out.printf("%s",b[num - 1]);

	}

}

