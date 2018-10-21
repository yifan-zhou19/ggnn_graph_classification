public class student
{
	   public String num = new String(new char[10]);
	   public int yuwen;
	   public int shuxue;
	   public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(3);
			student k = new student();
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i].num = tempVar2.charAt(0);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							a[i].yuwen = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							a[i].shuxue = Integer.parseInt(tempVar4);
						}
						a[i].sum = a[i].yuwen + a[i].shuxue;
		}
		s[0] = a[0];
		s[1] = a[0];
		s[1].sum = 0;
		s[2] = a[0];
		s[2].sum = 0;
		for (i = 1;i < n;i++)
		{
				  if (a[i].sum > s[2].sum && a[i].sum <= s[1].sum)
				  {
					  s[2] = a[i];
				  }
				  if (a[i].sum > s[1].sum && a[i].sum <= s[0].sum)
				  {
					  s[2] = s[1];
					  s[1] = a[i];
				  }
				  if (a[i].sum > s[0].sum)
				  {
					  s[2] = s[1];
					  s[1] = s[0];
					  s[0] = a[i];
				  }


		}
		for (i = 0;i < 3;i++)
		{
			   System.out.printf("%s %d\n",s[i].num,s[i].sum);
		}
		System.in.read();
		System.in.read();
	}

}

