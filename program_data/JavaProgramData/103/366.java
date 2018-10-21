package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String ch = "";
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		len = ch.length();
		int i = 0;
		int num = 0;
		char temp = ch.charAt(0);



	for (i = 0;i < len + 1;i++)
	{
			if (ch.charAt(i) == temp || ch.charAt(i) == (temp + 32) || ch.charAt(i) == (temp - 32))
			{
				num++;
			}
			else
			{
				if (97 <= temp && temp <= 122)
				{
					System.out.print("(");
					System.out.print((char)(temp - 32));
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print((char)temp);
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				}
				temp = ch.charAt(i);
				num = 1;
			}
	}


	  //cout<<(int)'A'<<endl;
		  return 0;
	}
}

