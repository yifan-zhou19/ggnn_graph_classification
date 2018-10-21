package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//??????? 
	//??????? 
	//??????
	//***********************************************************************
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void turn(int n, String a); //????turn
	public static int Main() //???
	{
		String str = new String(new char[101]);
		char g;
		char b;
		int c = 1;
		int[] p = new int[101];
		str = tangible.StringFunctions.changeCharacter(str, 0, System.in.read());
		b = str.charAt(0);
		for (int i = 1; i < 101; i++)
		{
				str = tangible.StringFunctions.changeCharacter(str, i, System.in.read());
				if (str.charAt(i) != str.charAt(0) && str.charAt(i) != '\n')
				{
						  g = str.charAt(i);
						  p[i] = 1;
				}
				if (str.charAt(i) == '\n')
				{
						  break;
				}
				c++;
		}
		for (int i = 1; i < c; i++)
		{
				if (str.charAt(i) == g)
				{
						  for (int j = i - 1; j >= 0; j--)
						  {
						  if (p[j] == 0)
						  {
							   System.out.print(j);
							   System.out.print(" ");
							   System.out.print(i);
							   System.out.print("\n");
							   p[j] = 1;
							   break;
						  }
						  }
				}
		}
		return 0;
	}

}

