package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		char c;
		String q;
		int s = 1;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(40 * (Character.SIZE / Byte.SIZE));
		do
		{
			c = System.in.read();
			p = tangible.StringFunctions.changeCharacter(p, i, c);

			i++;
		} while (c != '\n');
		q = p;
		for (; q != '\n';q++)
		{


			if (q >= '0' && q <= '9')
			{

					System.out.printf("%c", q);
				   s = 0;
			}
			if ((s == 0) && (q < '0' || q>'9'))
			{
				System.out.print("\n");
				s = 1;
			}
		}
	}
}

