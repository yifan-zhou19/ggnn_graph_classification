public class senex
{
	   public String id = new String(new char[10]);
	   public int age;
	   public int rec;
}

package <missing>;

public class GlobalMembers
{
	public static senex[] sen = tangible.Arrays.initializeWithDefaultsenexInstances(100);
	public static senex t = new senex();
	public static int n;

	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
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
			  sen[i].id = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  sen[i].age = Integer.parseInt(tempVar3);
		  }
		  if (sen[i].age >= 60)
		  {
			  sen[i].rec = 1;
		  }
		  else
		  {
			  sen[i].rec = 0;
		  }
		}
		for (i = 1;i < n;i++)
		{
		 for (j = 0;j < n - i;j++)
		 {
		  if (sen[j].rec < sen[j + 1].rec)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=sen[j];
			t.copyFrom(sen[j]);
			sen[j] = sen[j + 1];
			sen[j + 1] = t;
		  }
		 }
		}
		k = 0;
		while (sen[k].rec == 1)
		{
			k++;
		}
		for (i = 1;i < k;i++)
		{
		 for (j = 0;j < k - i;j++)
		 {
		  if (sen[j].age < sen[j + 1].age)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=sen[j];
			t.copyFrom(sen[j]);
			sen[j] = sen[j + 1];
			sen[j + 1] = t;
		  }
		 }
		}
		//for(i=0;i<n;i++)
		 //printf("%d ",sen[i].rec);
		for (i = 0;i < n;i++)
		{
		 System.out.printf("%s\n",sen[i].id);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

