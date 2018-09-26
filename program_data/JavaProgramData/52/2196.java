//      resort.c
//      
//      Copyright 2009 JacksonTB <jacksontb@jacksontb-laptop>
//      
//      This program is free software; you can redistribute it and/or modify
//      it under the terms of the GNU General Public License as published by
//      the Free Software Foundation; either version 2 of the License, or
//      (at your option) any later version.
//      
//      This program is distributed in the hope that it will be useful,
//      but WITHOUT ANY WARRANTY; without even the implied warranty of
//      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//      GNU General Public License for more details.
//      
//      You should have received a copy of the GNU General Public License
//      along with this program; if not, write to the Free Software
//      Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
//      MA 02110-1301, USA.



public class NODE
{
	public int value;
	public NODE fwd;
	public NODE bwd;
}

package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int m;
		int n;
		int i;
		NODE rootp;
		NODE recp;
		NODE prep;
		NODE lastp;

		rootp =  new NODE();
		rootp.fwd = null;
		prep = rootp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			recp =  new NODE();
			if (recp == null)
			{
				System.out.print("Not enough memory");
				return EXIT_FAILURE;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(recp.value) = Integer.parseInt(tempVar3);
			}
			recp.bwd = prep;
			prep.fwd = recp;
			recp.fwd = null;
			prep = recp;
		}

		recp = rootp;
		for (i = 1;i <= n - m + 1;i++)
		{
			recp = recp.fwd;
		}



		lastp = rootp;
		while (lastp.fwd != null)
		{
			lastp = lastp.fwd;
		}

		lastp.fwd = rootp.fwd;
		rootp.fwd.bwd = lastp;
		rootp.fwd = recp;
		recp.bwd.fwd = null;
		recp = rootp.fwd;
		while (recp != null)
		{
			System.out.printf("%d", recp.value);
			prep = recp;
			recp = recp.fwd;
			if (recp != null)
			{
				System.out.print(" ");
			}
			prep = null;
		}

	}

}

