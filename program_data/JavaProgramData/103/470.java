package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k;
		int len;
		int p;
		int q;
		int p1;
		int q1;
		int t;
		String b = new String(new char[1000]);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if ((b.charAt(0) >= 'a' && b.charAt(0) <= 'z') || (b.charAt(0) >= 'A' || b.charAt(0) <= 'Z'))
		{
			 len = b.length();
			 k = 0;
			 for (i = 0;i < len;i++)
			 {
				 p = b.charAt(i) - 'a';
				 q = b.charAt(i) - 'A'; //cout<<"ok"<<endl;
				 for (j = 0;j < len - i;j++)
				 {
					 p1 = b.charAt(i + j) - 'a';
					 q1 = b.charAt(i + j) - 'A';
					if (p == p1 || p == q1 || q == p1 || q == q1)
					{
					  k++;
					}
					else
					{

						if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
						{
							System.out.print("(");
						System.out.printf("%c",b.charAt(i) - 'a'+'A');
						System.out.print(",");
						System.out.print(k);
						System.out.print(")");
						}
						else
						{
						   System.out.print("(");
						   System.out.print(b.charAt(i));
						   System.out.print(",");
						   System.out.print(k);
						   System.out.print(")");
						}
						k = 0;
						break;
					}
				 }
				 if (i + j - 1 == len - 1)
				 {
					 break;
				 }
				 else
				 {
					 i = i + j - 1;
				 }
				 //cout<<i<<endl;
			 }
			 if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			 {
							System.out.print("(");
							System.out.printf("%c",b.charAt(i) - 'a'+'A');
							System.out.print(",");
							System.out.print(k);
							System.out.print(")");
			 }
						else
						{
						System.out.print("(");
						System.out.print(b.charAt(i));
						System.out.print(",");
						System.out.print(k);
						System.out.print(")");
						}

		}
		else
		{
			System.out.print(b);
			System.out.print("\n");
		}
	  return 0;
	}

}

