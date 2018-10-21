package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String give;
		  int num;
		  int i;
		  int j;
		  int k;
		  int j1;
		  int k1;
		  String head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  give = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  head = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		  give = new Scanner(System.in).nextLine();
		  head = give;
		  num = give.length();
		  String out;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  out = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		  for (i = 0;i < num - 1;i++)
		  {

							j = (int) * (give.Substring(i)) - 48;
							k = (int) * (give.Substring(1) + i) - 48;
							*(out.Substring(i)) = 'a' + j + k - 1;
							System.out.printf("%c",*(out.Substring(i)));
		  }
		  j1 = (int)(head) - 48;
		  k1 = (int) * (head.Substring(num) - 1) - 48;
		  *(out.Substring(i)) = 'a' + j1 + k1 - 1;
		  System.out.printf("%c",*(out.Substring(i)));

	}

}
