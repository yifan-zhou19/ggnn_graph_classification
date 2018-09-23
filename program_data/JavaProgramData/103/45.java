package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1000]);
		String = new Scanner(System.in).nextLine();
		int l;
		int i;
		int j;
		int count;
		l = String.length();
		for (i = 0;i < l;i++)
		{
			   if (String[i] < 'A' || string.charAt(i)>'Z')
			   {
			   String[i] = string.charAt(i) - 'a'+'A';
			   }
		}
		for (i = 0;i < l;i++)
		{
						count = 0;
						for (j = i;j < l;j++)
						{
										if (String[i] == string.charAt(j))
										{
										count++;
										}
										else
										{
										break;
										}
						}
						if (count != 0)
						{
						System.out.printf("(%c,%d)",string.charAt(i),count);
						i = i + count - 1;
						}
		}
		System.in.read();
		System.in.read();
	}
}
