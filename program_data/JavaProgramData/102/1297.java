public class stu
{
public String gen = new String(new char[7]);
public float hei;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(40); //shifouyaogaichengdongtai?
	stu t = new stu();
	int n;
	int i;
	int j;
	int s = 0;

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
								stu[i].gen = tempVar2.charAt(0);
							}
							String tempVar3 = ConsoleInput.scanfRead(" ");
							if (tempVar3 != null)
							{
								stu[i].hei = Float.parseFloat(tempVar3);
							}
	}

	for (j = 0;j < n;j++)
	{
	for (i = 0;i < n - 1 - j;i++)
	{
	   if (stu[i].hei > stu[i + 1].hei)
	   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu[i];
			t.copyFrom(stu[i]);
		 stu[i] = stu[i + 1];
		 stu[i + 1] = t;
	   }
	}
	}

	for (i = 0;i < n;i++)
	{
				   if (String.valueOf(stu[i].gen).length() == 4)
				   {
				  //  if(*(stu[i]).gen=='male')
					  if (s == 0)
					  {
					  System.out.printf("%.2f",stu[i].hei);
					  s++;
					  }
				  else
				  {
					  System.out.printf(" %.2f",stu[i].hei);
				  }
				   }
	}

	for (i = n - 1;i >= 0;i--)
	{
		if (String.valueOf(stu[i].gen).length() != 4)
		{
	  //if(*(stu[i]).gen!='male') 
	  System.out.printf(" %.2f",stu[i].hei);
		}
	}

	return 0;
	}
	//zifuchuanbijiaoyaoyonghanshu

}

