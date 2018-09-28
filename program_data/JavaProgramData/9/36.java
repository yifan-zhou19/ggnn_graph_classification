public class MAN
{
	public String id = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(MAN[] array, int nSize)
	{
	  int i;
	  int j;
	  for (i = 0; i < nSize ; i++)
	  {
		  for (j = nSize - 1; j > i; j--)
		  {
			  if (array[j].age >= 60 && array[j].age > array[j - 1].age)
			  {
				  MAN temp = array[j];
				  array[j] = array[j - 1];
				  array[j - 1] = temp;
			  }
		  }
	  }
	}
	public static int Main()
	{
	   int i;
	   int n;
	   MAN[] array = 0;
	   double ava;
	   double maxgap = 0;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   array = tangible.Arrays.initializeWithDefaultMANInstances(n);
	   for (i = 0; i < n ; i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   array[i].id = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   (array[i].age) = Integer.parseInt(tempVar3);
		   }
	   }

	   sort(array, n);
	   for (i = 0; i < n; i++)
	   {
		  System.out.printf("%s\n",array[i].id);
	   }

	   array = null;
	   return 0;
	}
}

