package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String in = new String(new char[1000]);
		  int i;
		  int num = 1;
		  int a;
		  int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  in = tempVar.charAt(0);
		  }
		  for (i = 0;in.charAt(i) != '\0';i++)
		  {
			   a = in.charAt(i);
			   b = in.charAt(i + 1);
			   if (a == b || a - b == 32 || a - b == -32)
			   {
				   num++;
			   }
			   else
			   {
				   if (in.charAt(i) < 91)
				   {
					   System.out.printf("(%c,%d)",in.charAt(i),num);
				   }
				   else
				   {
					   System.out.printf("(%c,%d)",in.charAt(i) - 32,num);
				   }
				   num = 1;
			   }
		  }

	}

}

