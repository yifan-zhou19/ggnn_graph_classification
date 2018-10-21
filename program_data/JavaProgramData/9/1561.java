public class stu
{
		 public String n = new String(new char[30]);
		 public int y;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(stu[] a, int l, int r)
	{
		 int i = l;
		 int j = r;
		 int t = a[(l + r) / 2].y;

		 stu temp = new stu();
		 while (i <= j)
		 {
			  while (a[i].y > t)
			  {
				  i++;
			  }
			  while (a[j].y < t)
			  {
				  j--;
			  }
			  if (i <= j)
			  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[i];
					  temp.copyFrom(a[i]);
					  a[i] = a[j];
					  a[j] = temp;
					  i++;
					  j--;
			  }

		 }
		 if (l < j)
		 {
			 sort(a, l, j);
		 }
		 if (i < r)
		 {
			 sort(a, i, r);
		 }
	}



	public static int Main()
	{
	   int n;
	   stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(1000);
	   stu[] b = tangible.Arrays.initializeWithDefaultstuInstances(1000);
	   stu[] c = tangible.Arrays.initializeWithDefaultstuInstances(1000);
	   stu temp = new stu();
	   int i;
	   int j;
	   int tot = 0;
	   int totc = 0;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   for (i = 1;i <= n;i++)
	   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i].n = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a[i].y = Integer.parseInt(tempVar3);
			  }
			  if (a[i].y >= 60)
			  {
					b[++tot] = a[i];
			  }
				 else
				 {
					c[++totc] = a[i];
				 }

	   }

	   for (i = 1;i < tot;i++)
	   {
		  for (j = 2;j <= tot - i + 1;j++)
		  {
			if (b[j - 1].y < b[j].y)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=b[j-1];
				   temp.copyFrom(b[j - 1]);
				   b[j - 1] = b[j];
				   b[j] = temp;

			}
		  }
	   }



	   for (i = 1;i <= tot;i++)
	   {
		   System.out.printf("%s\n",b[i].n);
	   }
	   for (i = 1;i <= totc;i++)
	   {
		   System.out.printf("%s\n",c[i].n);
	   }

	 //  scanf("%d",&n);

	   return 0;

	}

}

