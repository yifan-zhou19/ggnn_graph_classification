import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			while (n -- > 0)
			{
					String s = new String(new char[100]);
					s = new Scanner(System.in).nextLine();
					if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' || s.charAt(0) == '_')
					{
							int i = 0;
							while (s.charAt(i) != '\0')
							{
									if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '_')
									{
											;
									}
									else
									{
											break;
									}
									i++;
							}
							if (s.charAt(i) == '\0')
							{
									System.out.print(1);
									System.out.print("\n");
							}
							else
							{
									System.out.print(0);
									System.out.print("\n");
							}
					}
					else
					{
							System.out.print(0);
							System.out.print("\n");
					}
			}
			return 0;
	}

}

