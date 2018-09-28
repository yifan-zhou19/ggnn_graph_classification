package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  test
	//
	//  Created by ??? on 12-12-23.
	//  Copyright (c) 2012? ???. All rights reserved.
	//



		public static int Main()
		{
			int n;
			int i;
			int wl;
			int len = 0;
			int line = 0;
			String w = new String(new char[64]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (int i = 1; i <= n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					w = tempVar2.charAt(0);
				}
				wl = w.length();
				if (line == 0)
				{
					System.out.printf("%s",w);
					len = wl;
					line++;
				}
				else if (len + wl + 1 <= 80)
				{
					System.out.printf(" %s",w);
					len += wl + 1;
				}
				else if (len + wl + 1 > 80)
				{
					System.out.printf("\n%s",w);
					len = wl;
				}
			}
			return 0;
		}







}

