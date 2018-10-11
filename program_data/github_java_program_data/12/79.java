package com.gallerysystems.algorithm.tree.suffix;



/**
 * Rule 1: After splitting and inserting new node from the active node = root
 *
 *     1. active node is still the root node.
 *     2. active length is decremented.
 *     3. active edge is shifted right to the first character of the next suffix we need to insert.
 *
 * Rule 2:
 *
 *     If this newly created node is not the first one we created during current step, we link the
 *     previous created node to the current one through a suffix link.
 *
 * Rule 3: After splitting and inserting new node from the active node != root
 *
 *     1. We must follow the suffix link and set the active node to the node the link points to. If there
 *        is no suffix link, set the active node to the root.
 *     2. active length and active edge is still the same.
 *
 * Active Point - active node, active edge, active length.
 * Remainder    - the number indicates how many new suffixes we need to insert. It's incremented by 1 at the beginning of each step.
 *
 */
public class SuffixTree
{
	int end;
	SuffixTreeNode root;

	
}
