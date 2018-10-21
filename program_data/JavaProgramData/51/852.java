public class abb
{
	public String c = new String(new char[6]);
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int q;
		String s = new String(new char[600]);

		abb[] acc = tangible.Arrays.initializeWithDefaultabbInstances(300);
		abb add = new abb();

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}

		len = s.length();

		for (i = 0;i <= len - n;i++)
		{
			q = 0;
			for (j = i;j < i + n;j++)
			{
				acc[i].c = tangible.StringFunctions.changeCharacter(acc[i].c, q, s.charAt(j));
				q++;
			}
			acc[i].c = tangible.StringFunctions.changeCharacter(acc[i].c, q, '\0');
			acc[i].num = 1;

		}


		for (i = 0;i <= len - n;i++)
		{
			for (j = i + 1;j <= len - n;j++)
			{
				if (strcmp(acc[i].c,acc[j].c) == 0)
				{
					acc[i].num++;
				}
			}
		}


	   for (i = 1;i <= len - n;i++)
	   {
		   for (j = 0;j <= len - n - 1;j++)
		   {
			   if (acc[j].num < acc[j + 1].num)
			   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: add=acc[j];
				   add.copyFrom(acc[j]);
				   acc[j] = acc[j + 1];
				   acc[j + 1] = add;
			   }
		   }
	   }

	   i = 0;
	   if (acc[i].num != 1)
	   {
	   System.out.printf("%d\n",acc[i].num);
	   System.out.printf("%s\n",acc[i].c);

	   while (acc[i + 1].num == acc[i].num)
	   {
		   System.out.printf("%s\n",acc[i + 1].c);
	   i++;
	   }
	   }

	   else
	   {
		   System.out.print("NO");
	   }
	   return 0;
	}



}

