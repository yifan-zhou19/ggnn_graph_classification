package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[20]);
	  String min = new String(new char[20]);
	  String max = new String(new char[20]);
	  char c;
	  min = "1111111111111111111";
	  max = tangible.StringFunctions.changeCharacter(max, 0, '\0');
	  while (true)
	  {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
			if (min.length() > s.length())
			{
				min = s;
			}
			if (max.length() < s.length())
			{
				max = s;
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
	  }
	  System.out.printf("%s\n",max);
	  System.out.printf("%s\n",min);
	}
}

