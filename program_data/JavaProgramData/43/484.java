package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int o;
		int k;
		int l;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= (m / 2);i++)
		{
		   o = m - i;
		   for (k = 2;k < i;k++)
		   {
			  if (i % k == 0)
			  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto end;
			  }
		   }
		   for (l = 2;l < o;l++)
		   {
			  if (o % l == 0)
			  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto end;
			  }
		   }
		   System.out.print(i);
		   System.out.print(" ");
		   System.out.print(o);
		   System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		   end:
		   continue;
		}
		   return 0;
	}

}

