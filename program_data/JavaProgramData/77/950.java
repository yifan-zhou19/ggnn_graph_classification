package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char[][] temp = new char[101][2];
		char t;
		int len;
		int i;
		int j;
		int top = -1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(temp,0,(Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		len = s.length();
		i = 0;
		do
		{
			while (s.charAt(i) == s.charAt(0) && s.charAt(i))
			{
				top++;
				temp[top][1] = s.charAt(i);
				temp[top][2] = i;
				i++;
			}
			System.out.printf("%d %d\n",temp[top][2],i);
			top--;
			i++;

		}while (top != -1 && s.charAt(i));

		return 0;
	}

}
