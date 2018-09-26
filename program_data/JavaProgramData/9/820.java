package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct b
	//   {
	//	   char id[10];
	//	   int age;
	//   };
	   int n;
	   int i;
	   int j;
	   int k;
	   b[] a = tangible.Arrays.initializeWithDefaultbInstances(100);
	   b temp = new b();
	   b[] c = tangible.Arrays.initializeWithDefaultbInstances(100);
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
		   a[i].id = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   a[i].age = tempVar3;
	   }
	   }
	   for (i = 0,j = 0;i < n;i++)
	   {
		   if (a[i].age >= 60)
		   {
			   c[j] = a[i];
			   j++;
		   }
	   }
		for (i = j - 1;i >= 1;i--)
		{
			for (k = j - 1;k > j - i - 1;k--)
			{
				if (c[k].age > c[k - 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=c[k];
					temp.copyFrom(c[k]);
					c[k] = c[k - 1];
					c[k - 1] = temp;
				}
			}
		}
				for (i = 0;i < j;i++)
				{
					System.out.printf("%s\n",c[i].id);
				}
	   for (i = 0;i < n;i++)
	   {
		   if (a[i].age < 60)
		   {
		   System.out.printf("%s\n",a[i].id);
		   }
	   }
	}

}

