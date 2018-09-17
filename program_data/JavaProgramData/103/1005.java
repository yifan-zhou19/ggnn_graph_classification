package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ds
	//
	//  Created by Love on 12-12-27.
	//  Copyright (c) 2012? Love. All rights reserved.
	//

	public static int Main()
	{
		String sent = new String(new char[1001]);
		sent = new Scanner(System.in).nextLine();
		int i;
		int time = 0;
		for (i = 0; sent.charAt(i) != '\0'; i++)
		{
			if (sent.charAt(i) != sent.charAt(i + 1) && (sent.charAt(i) - sent.charAt(i + 1) != 'A'-'a' && sent.charAt(i) - sent.charAt(i + 1) != -'A'+'a'))
			{
				if (sent.charAt(i) >= 'a')
				{
				System.out.printf("(%c,%d)",sent.charAt(i) - 'a'+'A',time+1);
				}
				else
				{
				  System.out.printf("(%c,%d)",sent.charAt(i),time+1);
				}
				time = 0;
			}
			else
			{
				time++;
			}
		}
		return 0;
	}


}
