package <missing>;

public class GlobalMembers
{
	//
	//  Created by Chu-Pan,Wong on Dec 10, 2013.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//



	public static void Main(String[] args)
	{
		String s = new String(new char[31]);
		s = new Scanner(System.in).nextLine();
		int len = (int)s.length();
		String p = s;
		String q;
		for (int i = 0; i < len; i++)
		{
			if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
			{
				q = p.Substring(i);
				i++;
				while (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
				{
					i++;
				}
				*(p.Substring(i)) = 0;
				System.out.printf("%s\n", q);
			}
		}
	}
}
