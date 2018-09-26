package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[110]);
	  int[] flag = new int[110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(flag,1,(Integer.SIZE / Byte.SIZE));
	  str = new Scanner(System.in).nextLine();
	  int len = str.length();
	  int i;
	  for (i = 0; i < len - 1;i++)
	  {
		 if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
		 {
		   flag[i + 1] = 0;
		 }
	  }
	  for (i = 0; i < len; i++)
	  {
		 if (flag[i] != 0)
		 {
		   System.out.printf("%c",str.charAt(i));
		 }
	  }
	  return 1;
	}
}
