package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j = 0;
	  int k = 0;
	  int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct p
	//  {
	//	char id[10];
	//	int age;
	//   }
	//   a[n],b[n],c[n],d;
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
		if (a[i].age >= 60)
		{
			b[j] = a[i];
			j++;
		}
		else
		{
			c[k] = a[i];
			k++;
		}
	 }
	 for (i = 0;i < j - 1;i++)
	 {
	  for (l = 0;l < j - 1 - i;l++)
	  {
	   if (b[l].age < b[l + 1].age)
	   {
		d = b[l];
		b[l] = b[l + 1];
		b[l + 1] = d;
	   }
	  }
	 }
	  for (i = 0;i < j;i++)
	  {
	  System.out.printf("%s\n",b[i].id);
	  }
	   for (i = 0;i < k;i++)
	   {
	  System.out.printf("%s\n",c[i].id);
	   }
	}
}

