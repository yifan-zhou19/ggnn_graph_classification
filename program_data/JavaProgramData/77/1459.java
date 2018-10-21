package <missing>;

public class GlobalMembers
{
	public static int function(int begin, int end)
	{
	  int rembegin = begin;
	  if (begin + 1 == end)
	  {
		  return 0;
	  }
	  else
	  {
		  while (child.charAt(begin + 1) == ' ')
		  {
			   begin++;
		  }

		 if (child.charAt(begin + 1) == g)
		 {
			 int use = rembegin;
			 while (child.charAt(use) == ' ')
			 {
				use--;
			 }
			 for (int j = use;j <= begin + 1;j++)
			 {
				child = tangible.StringFunctions.changeCharacter(child, j, ' ');
			 }
		   System.out.print(use);
		   System.out.print(" ");
		   System.out.print(begin + 1);
		   System.out.print("\n");
		   //cout<<child<<" "<<begin<<" "<<use<<endl;
		   function(rembegin - 1, end);
		 }
		 else
		 {
			 function(rembegin + 1, end);
		 }
	  }
	}
	public static String child = new String(new char[110]);
	public static char b;
	public static char g;
	public static int Main()
	{
		char s;
		int i = 0;
		while ((s = System.in.read()) != '\n')
		{
			child = tangible.StringFunctions.changeCharacter(child, i, s);
			i++;
		}
		b = child.charAt(0);
		for (int j = 1;j <= i;j++)
		{
			if (child.charAt(j) != b)
			{
				  g = child.charAt(j);
				  break;
			}
		}

		function(0, i - 1);


		return 0;
	}



}

